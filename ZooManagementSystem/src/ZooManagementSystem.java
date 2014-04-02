import java.util.ArrayList;

import AdministrativeUnit.*;
import Animals.*;
import Visitors.*;
import ZooStructure.*;
import Human.*;

public class ZooManagementSystem {
	public static void main(String args[]){
		Zoo z = new Zoo();
		z.addAnimal(new Lion("Lion1", new Cages("LionCage")));
		z.addAnimal(new Elephant("Elephant1", new Cages("ElephantCage")));
//		z.addAnimal(new Carnivores("Lion", new Cages("LionCage")));
//		z.addAnimal(new Herbivores("Elephant",new Cages("ElephantCage")));
		
		z.addCleaner(new Cleaner());
		z.addDoctor(new Doctor("Doctor1"));
		z.addFeeder(new Feeder());
		z.addSE(new SeasonalEnvironmentalist());
		z.addSecurity(new Security());
		z.addService(new Service());
		z.addTicket(new Ticket());
		
		z.addParks(new Parks("Children Park"));
		z.addParks(new Parks("Science Park"));
		z.addStalls(new FoodStall("Burger Joint"));
		z.addStalls(new SoverignShop("Memories Forever"));
		
		z.addVisitor(new AnimalRightActivist ("PETA"));
		z.addVisitor(new GeneralPublic ("Jack"));
		z.addVisitor(new GeneralPublic ("Jill"));
		z.addVisitor(new HealthInspectors ());
		z.addVisitor(new Media("CNN"));
		z.addVisitor(new MovieMakers("Disney"));
		
		
		//Get the respective lists
		ArrayList<Animals> animals = z.getAnimals();
		
		ArrayList<Visitors> visitors = z.getVisitor();
		ArrayList<AnimalRightActivist> animalRightActivist = z.getAnimalRightActivist();
		ArrayList<GeneralPublic> generalPublic = z.getGeneralPublic();
		ArrayList<HealthInspectors> healthInspectors = z.getHealthInspectors();
		ArrayList<Media> media = z.getMedia();
		ArrayList<MovieMakers> movieMakers = z.getMovieMakers();

		ArrayList<Cleaner> cleaner = z.getCleanerList();
		ArrayList<Doctor> doctor  = z.getDoctorList();
		ArrayList<Feeder> feeder = z.getFeederList();
		ArrayList<SeasonalEnvironmentalist> sE = z.getSEList();
		ArrayList<Security> security = z.getSecurityList();
		ArrayList<Service> service = z.getServiceList();
		ArrayList<Ticket> ticket = z.getTicketList();
		
		
		AdminBuilding adminBuilding = z.getAdminBuilding();
		ArrayList<Cages> cages = z.getCageList();
		ArrayList<Parks> parks = z.getParkList();		
		SecurityBuilding securityBuilding = z.getSecurityBuilding();
		ArrayList<Stalls> stalls = z.getStallList();
		TicketBooth ticketBooth = z.getTicketBooth();
		
		ArrayList<Human> human = z.getHumans();
		//Administrative Building Interaction
		System.out.println("Adminstrative Building:");
		for(int i=0; i<human.size(); i++){
			adminBuilding.checkEntry(human.get(i));
		}
		//Parks interaction
		System.out.println("\nParks:");
		for(int i=0; i<parks.size(); i++){
			parks.get(i).keepClean();
		}
		
		//Cleaner interaction
		System.out.println("\nCleaner:");
		for(int i=0; i<cleaner.size(); i++){
			cleaner.get(i).clean();
		}
		//Doctor interaction 
		System.out.println("\nDoctor:");
		for(int i=0; i<doctor.size(); i++){
			for(int j=0; j<animals.size(); j++){
				doctor.get(i).treatAnimal(animals.get(j));
			}
		}
		//Feeder interaction 
		System.out.println("\nFeeder:");
		for(int i=0; i<feeder.size(); i++){
			for(int j=0; j<animals.size(); j++){
				feeder.get(i).feedAnimals(animals.get(j));
			}
		}
		//Seasonal environmentalist interaction 
		System.out.println("\nSeasonal Environmentalist:");
		for(int i=0; i<feeder.size(); i++){
			for(int j=0; j<cages.size(); j++){
				sE.get(i).setEnvironment(cages.get(j));
			}
		}
		//Security interaction 
		System.out.println("\nSecurity:");
		for(int i=0; i<security.size(); i++){
			for(int j=0; j<animals.size(); j++){
				security.get(i).animalCheck(animals.get(j));
			}
			for(int j=0; j<visitors.size(); j++){
				security.get(i).luggageCheck(visitors.get(j));
			}
		}
		//Service interaction
		System.out.println("\nService:");
		for(int i=0; i<service.size(); i++){
			for(int j=0; j<cages.size(); j++){
				service.get(i).cleanCages(cages.get(j));
			}
		}
		//Ticket interaction 
		System.out.println("\nTicket:");
		for(int i=0; i<ticket.size(); i++){
			for(int j=0; j<visitors.size(); j++){
				ticket.get(i).giveTickets(visitors.get(j));
			}
		}
		//Animal Right Activist interaction 
		System.out.println("\nAnimal Right Activist:");
		for(int i=0; i<animalRightActivist.size(); i++){
			animalRightActivist.get(i).purchaseTicket();
			animalRightActivist.get(i).baggageCheck();
			for(int j=0; j<animals.size(); j++){
				animalRightActivist.get(i).monitor(animals.get(j));
			}
		}
		//General Public  interaction
		System.out.println("\nGeneral Public:");
		for(int i=0; i<generalPublic.size(); i++){
			generalPublic.get(i).purchaseTicket();
			generalPublic.get(i).baggageCheck();
			for(int j=0; j<animals.size(); j++){
				generalPublic.get(i).watchAnimals(animals.get(j));
			}
			for(int j=0; j<stalls.size(); j++){
				generalPublic.get(i).doShopping(stalls.get(j));
			}
			for(int j=0; j<parks.size(); j++){
				generalPublic.get(i).playPark(parks.get(j));
			}
		}
		//Health Inspectors interaction
		System.out.println("\nHealth Inspectors:");
		for(int i=0; i<healthInspectors.size(); i++){
			healthInspectors.get(i).purchaseTicket();
			healthInspectors.get(i).baggageCheck();
			for(int j=0; j<animals.size(); j++){
				healthInspectors.get(i).monitorCondition(animals.get(j));
			}
			healthInspectors.get(i).writeReport();
		}
		//Media Interaction
		System.out.println("\nMedia:");
		for(int i=0; i<media.size(); i++){
			media.get(i).purchaseTicket();
			media.get(i).baggageCheck();
			for(int j=0; j<animals.size(); j++){
				media.get(i).takePictures(animals.get(j));
			}
			media.get(i).writeArticles();
		}
		//Movie Makers Interaction 
		System.out.println("\nMovie Makers:");
		for(int i=0; i<movieMakers.size(); i++){
			movieMakers.get(i).purchaseTicket();
			movieMakers.get(i).baggageCheck();
			for(int j=0; j<animals.size(); j++){
				movieMakers.get(i).doShooting(animals.get(j));
			}
		}		
	}
}
