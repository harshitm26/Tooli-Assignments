import java.util.ArrayList;

import AdministrativeUnit.*;
import Animals.*;
import Human.*;
import Visitors.*;
import ZooStructure.*;

public class Zoo {
	private ArrayList<Animals> animalList ;
	private ArrayList<Visitors> visitorList ;
	private ArrayList<Doctor> doctorList ;
	private ArrayList<SeasonalEnvironmentalist> seList ;
	private ArrayList<Feeder> feederList;
	private ArrayList<Service> serviceList;
	private ArrayList<Cleaner> cleanerList;
	private ArrayList<Security> securityList ;
	private ArrayList<Ticket> ticketList ;
	private ArrayList<Cages> cageList ;
	private ArrayList<Parks> parkList ;
	private ArrayList<Stalls> stallList ;
	private AdminBuilding adminBuilding;
	private SecurityBuilding securityBuilding;
	private TicketBooth ticketBooth;

	public Zoo(){
		this.animalList  = new ArrayList<Animals>();
		this.visitorList = new ArrayList<Visitors>();
		this.doctorList = new ArrayList<Doctor>();
		this.seList = new ArrayList<SeasonalEnvironmentalist>();
		this.feederList  = new ArrayList<Feeder>();
		this.serviceList = new ArrayList<Service>();
		this.cleanerList = new ArrayList<Cleaner>();
		this.securityList = new ArrayList<Security>();
		this.ticketList = new ArrayList<Ticket>();
		this.cageList = new ArrayList<Cages>();
		this.parkList = new ArrayList<Parks>();
		this.stallList = new ArrayList<Stalls>();
		this.adminBuilding = new AdminBuilding();
		this.ticketBooth = new TicketBooth();
		this.securityBuilding = new SecurityBuilding();
	}
	
	public ArrayList<Animals> getAnimals(){
		return animalList;
	}
	public void addAnimal(Animals a){
		animalList.add(a);
		cageList.add(a.getCage());
	}
	public void deleteAnimal(Animals a){
		animalList.remove(a);
		cageList.remove(a.getCage());
	}
	
	public ArrayList<Visitors> getVisitor(){
		return visitorList;
	}
	public void addVisitor(Visitors v){
		visitorList.add(v);
	}
	public void delteVisitor(Visitors v){
		visitorList.remove(v);
	}
	public ArrayList<GeneralPublic> getGeneralPublic(){
		ArrayList<GeneralPublic> generalPublic = new ArrayList<GeneralPublic> ();
		for(int i=0; i<visitorList.size(); i++){
			if(visitorList.get(i) instanceof GeneralPublic){
				generalPublic.add((GeneralPublic)visitorList.get(i));
			}
		}
		return generalPublic;
	}
	public ArrayList<AnimalRightActivist> getAnimalRightActivist(){
		ArrayList<AnimalRightActivist> animalRightActivist = new ArrayList<AnimalRightActivist> ();
		for(int i=0; i<visitorList.size(); i++){
			if(visitorList.get(i) instanceof AnimalRightActivist){
				animalRightActivist.add((AnimalRightActivist)visitorList.get(i));
			}
		}
		return animalRightActivist;
	}
	public ArrayList<HealthInspectors> getHealthInspectors(){
		ArrayList<HealthInspectors> healthInspectors = new ArrayList<HealthInspectors> ();
		for(int i=0; i<visitorList.size(); i++){
			if(visitorList.get(i) instanceof HealthInspectors){
				healthInspectors.add((HealthInspectors)visitorList.get(i));
			}
		}
		return healthInspectors;
	}
	public ArrayList<Media> getMedia(){
		ArrayList<Media> media = new ArrayList<Media> ();
		for(int i=0; i<visitorList.size(); i++){
			if(visitorList.get(i) instanceof Media){
				media.add((Media)visitorList.get(i));
			}
		}
		return media;
	}
	public ArrayList<MovieMakers> getMovieMakers(){
		ArrayList<MovieMakers> movieMakers = new ArrayList<MovieMakers> ();
		for(int i=0; i<visitorList.size(); i++){
			if(visitorList.get(i) instanceof MovieMakers){
				movieMakers.add((MovieMakers)visitorList.get(i));
			}
		}
		return movieMakers;
	}
	
	public ArrayList<Doctor> getDoctorList(){
		return doctorList;
	}
	public void addDoctor(Doctor d){
		doctorList.add(d);
	}
	public void removeDoctor(Doctor d ){
		doctorList.remove(d);
	}
	
	public ArrayList<SeasonalEnvironmentalist> getSEList(){
		return seList;
	}
	public void addSE(SeasonalEnvironmentalist se){
		seList.add(se);
	}
	public void removeSE(SeasonalEnvironmentalist  se ){
		seList.remove(se);
	}
	
	
	public ArrayList<Feeder> getFeederList(){
		return feederList;
	}
	public void addFeeder(Feeder f){
		feederList.add(f);
	}
	public void removeFeeder(Feeder f ){
		feederList.remove(f);
	}
	
	
	public ArrayList<Service> getServiceList(){
		return serviceList;
	}
	public void addService(Service s){
		serviceList.add(s);
	}
	public void removeService(Service s){
		serviceList.remove(s);
	}
	
	public ArrayList<Cleaner> getCleanerList(){
		return cleanerList;
	}
	public void addCleaner(Cleaner c){
		cleanerList.add(c);
	}
	public void deleteCleaner(Cleaner c){
		cleanerList.remove(c);
	}
	
	public ArrayList<Security> getSecurityList(){
		return securityList;
	}
	public void addSecurity(Security s){
		securityList.add(s);
	}
	public void removeSecurity(Security s ){
		securityList.remove(s);
	}
	
	
	public ArrayList<Ticket> getTicketList(){
		return ticketList;
	}
	public void addTicket(Ticket t){
		ticketList.add(t);
	}
	public void removeTicket(Ticket t ){
		ticketList.remove(t);
	}
	
	public ArrayList<Cages> getCageList(){
		return cageList;
	}
	public void addCages(Cages c){
		cageList.add(c);
	}
	public void removeCages(Cages c){
		cageList.remove(c);
	}
	
	public ArrayList<Parks> getParkList(){
		return parkList;
	}
	public void addParks(Parks p){
		parkList.add(p);
	}
	public void removeParks(Parks p){
		parkList.remove(p);
	}
	
	public ArrayList<Stalls> getStallList(){
		return stallList;
	}
	public void addStalls(Stalls s){
		stallList.add(s);
	}
	public void deleteStalls(Stalls s){
		stallList.remove(s);
	}
	
	public AdminBuilding getAdminBuilding(){
		return adminBuilding;
	}
	public SecurityBuilding getSecurityBuilding(){
		return securityBuilding;
	}
	public TicketBooth getTicketBooth(){
		return ticketBooth;
	}
	
	public ArrayList<AdministrativeUnit> getAdministrativeUnit(){
		ArrayList<AdministrativeUnit> administrativeUnit = new ArrayList<AdministrativeUnit>();
		for(int i=0; i<cleanerList.size(); i++){
			administrativeUnit.add(cleanerList.get(i));
		}
		for(int i=0; i<doctorList.size(); i++){
			administrativeUnit.add(doctorList.get(i));
		}
		for(int i=0; i<feederList.size(); i++){
			administrativeUnit.add(feederList.get(i));
		}
		for(int i=0; i<seList.size(); i++){
			administrativeUnit.add(seList.get(i));
		}
		for(int i=0; i<securityList.size(); i++){
			administrativeUnit.add(securityList.get(i));
		}
		for(int i=0; i<serviceList.size(); i++){
			administrativeUnit.add(serviceList.get(i));
		}
		for(int i=0; i<ticketList.size(); i++){
			administrativeUnit.add(ticketList.get(i));
		}
		return administrativeUnit;
	}
	
	public ArrayList<Human> getHumans(){
		ArrayList<Human> human = new ArrayList<Human>();
		ArrayList<AdministrativeUnit> administrativeUnit = getAdministrativeUnit();
		for(int i=0; i<visitorList.size(); i++){
			human.add(visitorList.get(i));
		}
		for(int i=0; i<administrativeUnit.size(); i++){
			human.add(administrativeUnit.get(i));
		}
		return human;
	}
	
}
