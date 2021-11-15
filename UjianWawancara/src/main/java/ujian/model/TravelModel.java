package ujian.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="travel")
public class TravelModel {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String namaSupir;
	private String noTelp;
	private String alamat;
	private String noPolisi;
}
