package ujian.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="tiket")
public class TiketModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idPenumpang", referencedColumnName = "id")
	private PenumpangModel idPenumpang;
    @OneToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "idTravel", referencedColumnName = "id")
	private TravelModel idTravel;
	private String jadwal;
}
