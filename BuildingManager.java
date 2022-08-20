class OwnerDetails
{
	private String name;
	private String id;
	private String mobile;
	private String address;
	
	public OwnerDetails()
	{
		
	}

	public OwnerDetails(
			String name,
			String id,
			String mobile,
			String address) 
	{
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		this.address = address;
	}
	
	public void printOwnerDetails()
	{
		System.out.println("owner name: "+name);
		System.out.println("owner id: "+ id);
		System.out.println("owner mobile: "+ mobile);
		System.out.println("owner address: "+ address);
		//System.out.println();
	}
	
}

class Building_Details{
	private int noOfParkingSlots;
	private int noOfFloors;
	private int noOfLifts;
	private String builder;
	private String waterSource;
	private String electricitySource;
	private String address;
	protected String name;
	private int maxCapacity;
	private float area;
	private String color;
	private int gates;
	private float avgElectricityConsumtion;
	private float avgWaterConsumtion;
	private String buildingUser;
	
	private OwnerDetails ownerDetails;
	
	Building_Details()
	{
		ownerDetails = new OwnerDetails();
	}
	
	public Building_Details(
			int noOfParkingSlots, 
			int noOfFloors, 
			int noOfLifts, 
			OwnerDetails ownerDetails,
			String builder, 
			String waterSource, 
			String electricitySource, 
			String address, 
			String name, 
			int maxCapacity,
			float area, 
			String color, 
			int gates,
			float avgElectricityConsumtion, 
			float avgWaterConsumtion,
			String buildingUser) 
	{
		this.noOfParkingSlots = noOfParkingSlots;
		this.noOfFloors = noOfFloors;
		this.noOfLifts = noOfLifts;
		this.ownerDetails = ownerDetails;
		this.builder = builder;
		this.waterSource = waterSource;
		this.electricitySource = electricitySource;
		this.address = address;
		this.name = name;
		this.maxCapacity = maxCapacity;
		this.area = area;
		this.color = color;
		this.gates = gates;
		this.avgElectricityConsumtion = avgElectricityConsumtion;
		this.avgWaterConsumtion = avgWaterConsumtion;
		this.buildingUser = buildingUser;
	}
	
	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
	public int getNoOfParkingSlots() {
		return noOfParkingSlots;
	}
	public void setNoOfParkingSlots(int noOfParkingSlots) {
		this.noOfParkingSlots = noOfParkingSlots;
	}
	public int getNoOfFloors() {
		return noOfFloors;
	}
	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}
	public int getNoOfLifts() {
		return noOfLifts;
	}
	public void setNoOfLifts(int noOfLifts) {
		this.noOfLifts = noOfLifts;
	}
	public OwnerDetails getOwnerDetails() {
		return ownerDetails;
	}
	public void setOwnerDetails(OwnerDetails ownerDetails) {
		this.ownerDetails = ownerDetails;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getWaterSource() {
		return waterSource;
	}
	public void setWaterSource(String waterSource) {
		this.waterSource = waterSource;
	}
	public String getElectricitySource() {
		return electricitySource;
	}
	public void setElectricitySource(String electricitySource) {
		this.electricitySource = electricitySource;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getGates() {
		return gates;
	}
	public void setGates(int gates) {
		this.gates = gates;
	}
	public float getAvgElectricityConsumtion() {
		return avgElectricityConsumtion;
	}
	public void setAvgElectricityConsumtion(float avgElectricityConsumtion) {
		this.avgElectricityConsumtion = avgElectricityConsumtion;
	}
	public float getAvgWaterConsumtion() {
		return avgWaterConsumtion;
	}
	public void setAvgWaterConsumtion(float avgWaterConsumtion) {
		this.avgWaterConsumtion = avgWaterConsumtion;
	}
	public String getBuildingUser() {
		return buildingUser;
	}
	public void setBuildingUser(String buildingUser) {
		this.buildingUser = buildingUser;
	}
	
	// =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	
	
	public void avgElectricityConsumtion()
	{
		System.out.println("Avg electricity usage per month : "+noOfFloors*avgElectricityConsumtion);
	}
	public void avgWaterConsumtion()
	{
		System.out.println("Avg Water usage per month : "+noOfFloors*avgWaterConsumtion);

	}
	
	public void printBuildingDetails()
	{
		System.out.println("noOfParkingSlots: "+ noOfParkingSlots);
		System.out.println("noOfFloors: "+noOfFloors);
		System.out.println("noOfLifts: "+ noOfLifts);
		ownerDetails.printOwnerDetails();
		System.out.println("builder: "+builder);
		System.out.println("waterSource: "+waterSource);
		System.out.println("electricitySource: "+electricitySource);
		System.out.println("address: "+address);
		System.out.println("maxCapacity: "+maxCapacity);
		System.out.println("area: "+area);
		System.out.println("color: "+color);
		System.out.println("gates: "+gates);
		System.out.println("avgElectricityConsumtion: "+avgElectricityConsumtion);
		System.out.println("avgWaterConsumtion: "+avgWaterConsumtion);
		System.out.println("buildingUser: "+buildingUser);
		System.out.println();
	}
	
	
	
}

class Residential_Building_Details extends Building_Details
{
	int noOfFlats;
	int noOfOccupiedFlats;
	int noOfPeopleLiving; // assumption: 3 people living in each flat
	
	public Residential_Building_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Residential_Building_Details(
			int noOfParkingSlots, 
			int noOfFloors, 
			int noOfLifts, 
			OwnerDetails ownerDetails,
			String builder, 
			String waterSource, 
			String electricitySource, 
			String address, 
			String name, 
			int maxCapacity,
			float area, 
			String color, 
			int gates, 
			float avgElectricityConsumtion, 
			float avgWaterConsumtion,
			String buildingUser, 
			int noOfFlats, 
			int noOfOccupiedFlats, 
			int noOfPeopleLiving) 
	{
		super(noOfParkingSlots, noOfFloors, noOfLifts, ownerDetails, builder, waterSource, electricitySource, address, name,
				maxCapacity, area, color, gates, avgElectricityConsumtion, avgWaterConsumtion, buildingUser);
		// TODO Auto-generated constructor stub
		this.noOfFlats = noOfFlats;
		this.noOfOccupiedFlats = noOfOccupiedFlats;
		this.noOfPeopleLiving = noOfPeopleLiving;
	}
	
	public int getNoOfFlats() {
		return noOfFlats;
	}
	public void setNoOfFlats(int noOfFlats) {
		this.noOfFlats = noOfFlats;
	}
	public int getNoOfOccupiedFlats() {
		return noOfOccupiedFlats;
	}
	public void setNoOfOccupiedFlats(int noOfOccupiedFlats) {
		this.noOfOccupiedFlats = noOfOccupiedFlats;
	}
	public int getNoOfPeopleLiving() {
		return noOfPeopleLiving;
	}
	public void setNoOfPeopleLiving(int noOfPeopleLiving) {
		this.noOfPeopleLiving = noOfPeopleLiving;
	}
	
	public void rentFlat() {
		noOfOccupiedFlats++;
		noOfPeopleLiving+=3;
		
		System.out.print("\nDETAILS AFTER RENT");
		print();
	}
	public void vacateFlat() {
		noOfOccupiedFlats--;
		noOfPeopleLiving-=3;
		
		System.out.print("\nDETAILS AFTER VACATING");
		print();
	}
	
	public void print()
	{
		System.out.println("\nnoOfFlats: " + noOfFlats);
		System.out.println("noOfOccupiedFlats: " + noOfOccupiedFlats);
		System.out.println("noOfPeopleLiving: "+noOfPeopleLiving);
		System.out.print("\n");
	}
	public void printBuildingDetails()
	{
		System.out.print("DETAILS FOR " + name.toUpperCase());
		print();
		super.printBuildingDetails();
	}
	
}

class Hotel_Building_Details extends Building_Details
{
	int noOfRooms;
	int avgTax;
	int avgPeopleStaying;
	int avgInternationalGuests;
	int starOfHotel;
	
	
	public Hotel_Building_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel_Building_Details(int noOfParkingSlots,
			int noOfFloors,
			int noOfLifts,
			OwnerDetails ownerDetails,
			String builder,
			String waterSource,
			String electricitySource,
			String address,
			String name,
			int maxCapacity,
			float area,
			String color,
			int gates,
			float avgElectricityConsumtion,
			float avgWaterConsumtion,
			String buildingUser,
			int noOfRooms,
			int avgTax,
			int avgPeopleStaying,
			int avgInternationalGuests,
			int starOfHotel) {
		super(noOfParkingSlots, noOfFloors, noOfLifts, ownerDetails, builder, waterSource, electricitySource, address, name,
				maxCapacity, area, color, gates, avgElectricityConsumtion, avgWaterConsumtion, buildingUser);
				
				this.noOfRooms = noOfRooms;
				this.avgTax = avgTax;
				this.avgPeopleStaying = avgPeopleStaying;
				this.avgInternationalGuests = avgInternationalGuests;
				this.starOfHotel = starOfHotel;
	}
	
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public int getAvgTax() {
		return avgTax;
	}
	public void setAvgTax(int avgTax) {
		this.avgTax = avgTax;
	}
	public int getAvgPeopleStaying() {
		return avgPeopleStaying;
	}
	public void setAvgPeopleStaying(int avgPeopleStaying) {
		this.avgPeopleStaying = avgPeopleStaying;
	}
	public int getAvgInternationalGuests() {
		return avgInternationalGuests;
	}
	public void setAvgInternationalGuests(int avgInternationalGuests) {
		this.avgInternationalGuests = avgInternationalGuests;
	}
	public int getStarOfHotel() {
		return starOfHotel;
	}
	public void setStarOfHotel(int starOfHotel) {
		this.starOfHotel = starOfHotel;
	}
	
	public void printBuildingDetails()
	{
		System.out.print("DETAILS FOR " + name.toUpperCase());
		
		System.out.println("\nnoOfRooms: "+ noOfRooms);
		System.out.println("avgTax: "+ avgTax);
		System.out.println("avgPeopleStaying: "+ avgPeopleStaying);
		System.out.println("avgInternationalGuests: "+ avgInternationalGuests);
		System.out.println("starOfHotel: "+ starOfHotel);
		
		super.printBuildingDetails();
	}
	
}

class Corporate_Building_Details extends Building_Details
{
	
	int noOfCompanies;
	int noOfEmployees;
	int noOfBuildingStaff;
	int tax;
	
	public Corporate_Building_Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Corporate_Building_Details(int noOfParkingSlots,
			int noOfFloors,
			int noOfLifts,
			OwnerDetails ownerDetails,
			String builder,
			String waterSource,
			String electricitySource,
			String address,
			String name,
			int maxCapacity,
			float area,
			String color,
			int gates,
			float avgElectricityConsumtion,
			float avgWaterConsumtion,
			String buildingUser,
			int noOfCompanies,
			int noOfEmployees,
			int noOfBuildingStaff,
			int tax) {
		super(noOfParkingSlots, noOfFloors, noOfLifts, ownerDetails, builder, waterSource, electricitySource, address, name,
				maxCapacity, area, color, gates, avgElectricityConsumtion, avgWaterConsumtion, buildingUser);
		// TODO Auto-generated constructor stub
		
			this.noOfCompanies = noOfCompanies;
			this.noOfEmployees = noOfEmployees;
			this.noOfBuildingStaff = noOfBuildingStaff;
			this.tax = tax;
	}
	public int getNoOfCompanies() {
		return noOfCompanies;
	}
	public void setNoOfCompanies(int noOfCompanies) {
		this.noOfCompanies = noOfCompanies;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public int getNoOfBuildingStaff() {
		return noOfBuildingStaff;
	}
	public void setNoOfBuildingStaff(int noOfBuildingStaff) {
		this.noOfBuildingStaff = noOfBuildingStaff;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	public void printBuildingDetails()
	{
		System.out.print("DETAILS FOR " + name.toUpperCase());
		
		System.out.println("\nnoOfCompanies: "+ noOfCompanies);
		System.out.println("noOfEmployees: "+ noOfEmployees);
		System.out.println("noOfBuildingStaff: "+ noOfBuildingStaff);
		System.out.println("Tax: "+ tax);
		
		super.printBuildingDetails();
	}
	
}
public class BuildingManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Residential_Building_Details anugraha = 
				new Residential_Building_Details(100,15,4,new OwnerDetails("Janardhan Gowda","1234","9560744209","anugraha complex banglore"),"l&t","BCM","Reliance","anugraha complex dasrshalli","anugraha complex",
						120,2000,"green",1,1000,500,"owner", 100, 70, 210);
		Residential_Building_Details shivarna =
				new Residential_Building_Details(100,15,4,new OwnerDetails("Vasuda Shetty","9876","8989897667","anugraha complex banglore"),"l&t","BCM","Reliance","Shivarna building dasrshalli","Shivarna building",
						120,2000,"white",1,1000,500,"owner", 100, 70, 210);
		
		anugraha.printBuildingDetails();
		shivarna.printBuildingDetails();
		
		anugraha.rentFlat();
		anugraha.rentFlat();
		anugraha.rentFlat();
		
		anugraha.vacateFlat();
		
		Residential_Building_Details snn = 
				new Residential_Building_Details(150,25,6,new OwnerDetails("Saggu","9811","892657667","SNN banglore"),"l&t","BCM","Reliance","SNN BANGLORE","SNN1 building",
						180,5000,"grey",4,5000,800,"owner", 500, 120, 360);
		
		Hotel_Building_Details ibis = 
				new Hotel_Building_Details(88,8,3,new OwnerDetails("aanchal","911","8926667","S banglore"),"l&t","BCM","Reliance","TOIT BANGLORE","IBIS building",
						140,500,"black",2,2500,300,"owner", 250, 120000, 3600,550,4);
		
		Hotel_Building_Details hilton = 
				new Hotel_Building_Details(88,8,3,new OwnerDetails("noname","119","832567","N banglore"),"l&t","BCM","Reliance","indranagar BANGLORE","hilton building",
						140,500,"black",2,2500,300,"owner", 180, 150000, 4800,850,5);
		
		snn.printBuildingDetails();
		ibis.printBuildingDetails();
		hilton.printBuildingDetails();
		
		Corporate_Building_Details cognizant = 
				new Corporate_Building_Details(88,8,3,new OwnerDetails("noname","119","832567","N banglore"),"l&t","BCM","Reliance","indranagar BANGLORE","Cognizant1",
						140,500,"black",2,2500,300,"owner", 1, 10000, 1500,85000);
		
		cognizant.printBuildingDetails();
	}

}
