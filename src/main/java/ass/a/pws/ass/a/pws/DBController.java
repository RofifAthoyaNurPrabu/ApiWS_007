package ass.a.pws.ass.a.pws;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/indomie")
public class DBController {
     @Autowired
  private IndomieStoreRepo indomie ;
 
  @GetMapping("/indomie")
  public List<IndomieStore> getAllguccistore(){
      return indomie.findAll();
  }
   @GetMapping ("/indomie/{id}")
    public IndomieStore getIndomieStoreById(@PathVariable Long id){
        return indomie.findById(id).get();
    }
    
    @PostMapping ("/indomie")
    public IndomieStore saveguccistoreDetails(@RequestBody IndomieStore s){
        return indomie.save(s);
    }
    
    @PutMapping("/indomie")
    public IndomieStore updateOushop(@RequestBody IndomieStore s){
        return indomie.save(s);
    }
    
    @DeleteMapping("/indomie/{idbarang}")
    public ResponseEntity<HttpStatus> getIndomieStoreById(@PathVariable long id_indomie){
        indomie.deleteById(id_indomie);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
}
