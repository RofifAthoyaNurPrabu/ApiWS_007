package ass.a.pws.ass.a.pws;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="indomie")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IndomieStore {
    @Id
    private String id_indomie;
    private String jenis;    
    private String harga;
}
