package ujian.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ujian.model.PenumpangModel;
import ujian.model.TiketModel;
import ujian.model.TravelModel;
import ujian.repo.PenumpangRepo;
import ujian.repo.TiketRepo;
import ujian.repo.TravelRepo;

@RestController
public class RestUjianController {
    @Autowired
    TiketRepo tiketRepo;
    @Autowired
    PenumpangRepo penumpangRepo;
    @Autowired
    TravelRepo travelRepo;

    @GetMapping("/api/tiket")
	public List<TiketModel> getAllTiketApi() {
		List<TiketModel> tiket = tiketRepo.findAll();
		return tiket;
	}

    @PostMapping("/api/tiket")
	public TiketModel saveTiketApi(@RequestBody TiketModel tiket) {
		return tiketRepo.save(tiket);
	}

    @PutMapping("/api/tiket")
	public TiketModel updateTiketApi(@RequestBody TiketModel tiket) {
		return tiketRepo.save(tiket);
	}

    @DeleteMapping("/api/tiket/{id}")
	public String deleteTiketApi(@PathVariable int id) {
		tiketRepo.deleteById(id);
		return "Delete successfully";
	}

    @GetMapping("/api/penumpang")
	public List<PenumpangModel> getAllPenumpangApi() {
		List<PenumpangModel> penumpang = penumpangRepo.findAll();
		return penumpang;
	}

    @GetMapping("/penumpang")
	public String getAllPenumpang(Model model) {
		List<PenumpangModel> penumpangModels = penumpangRepo.findAll();
        model.addAttribute("penumpang", penumpangModels);
		return "index";
	}

    @PostMapping("/api/penumpang")
	public PenumpangModel savePenumpangApi(@RequestBody PenumpangModel penumpang) {
		return penumpangRepo.save(penumpang);
	}

    @PutMapping("/api/penumpang")
	public PenumpangModel updatePenumpangApi(@RequestBody PenumpangModel penumpang) {
		return penumpangRepo.save(penumpang);
	}

    @DeleteMapping("/api/penumpang/{id}")
	public String deletePenumpangApi(@PathVariable int id) {
		penumpangRepo.deleteById(id);
		return "Delete successfully";
	}

    @GetMapping("/api/travel")
	public List<TravelModel> getAllTravelApi() {
		List<TravelModel> travel = travelRepo.findAll();
		return travel;
	}

    @PostMapping("/api/travel")
	public TravelModel saveTravelApi(@RequestBody TravelModel travel) {
		return travelRepo.save(travel);
	}

    @PutMapping("/api/travel")
	public TravelModel updateTravelApi(@RequestBody TravelModel travel) {
		return travelRepo.save(travel);
	}

    @DeleteMapping("/api/travel/{id}")
	public String deleteTravelApi(@PathVariable int id) {
		travelRepo.deleteById(id);
		return "Delete successfully";
	}
}
