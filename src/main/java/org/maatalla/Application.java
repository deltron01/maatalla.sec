package org.maatalla;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.maatalla.dao.EtudiantRepository;
import org.maatalla.entities.Etudiant;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) throws ParseException {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		EtudiantRepository etudiantRepository = ctx.getBean(EtudiantRepository.class);
		/*DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		etudiantRepository.save(new Etudiant("safouane", "safouane", df.parse("2001-05-12")));
		etudiantRepository.save(new Etudiant("Med", "Hammadi", df.parse("2002-11-28")));
		etudiantRepository.save(new Etudiant("Med", "Omara", df.parse("1980-07-26")));
		etudiantRepository.save(new Etudiant("ALi", "Maatalla", df.parse("1998-01-05")));
		etudiantRepository.save(new Etudiant("Hind", "Malik", df.parse("1976-04-02")));
		etudiantRepository.save(new Etudiant("Asmae", "Sole", df.parse("1999-11-01")));*/
		List<Etudiant> list = etudiantRepository.findAll();
		list.forEach(p->System.out.println(p.getNom()));
	}
}
