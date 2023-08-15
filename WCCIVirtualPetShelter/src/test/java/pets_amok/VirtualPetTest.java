package pets_amok;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {
    @Test
    public void testOilPets1() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboCat testPet1 = new RoboCat("Dave", "orca");
        RoboCat testPet2 = new RoboCat("Dave", "orca");
        OrganicCat testPet3 = new OrganicCat("Dave", "orca");
        testPet1.tick();
        testPet2.tick();
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.oilRobots();
        assertEquals(100, testPet1.getOil(), "Pet 1 not oiled");
        assertEquals(100, testPet2.getOil(), "Pet 2 not oiled");
    }

    @Test
    public void testOilPets2() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboCat testPet1 = new RoboCat("Dave", "orca");
        RoboCat testPet2 = new RoboCat("Dave", "orca");
        OrganicCat testPet3 = new OrganicCat("Dave", "orca");
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.oilRobots();
        assertEquals(100, testPet1.getOil(), "Pet 1 not oiled");
        assertEquals(100, testPet2.getOil(), "Pet 2 not oiled");
    }

    @Test
    public void testOilPets3() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        RoboDog testPet2 = new RoboDog("Dave", "orca");
        OrganicDog testPet3 = new OrganicDog("Dave", "orca");
        testPet1.tick();
        testPet2.tick();
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.oilRobots();
        assertEquals(100, testPet1.getOil(), "Pet 1 not oiled");
        assertEquals(100, testPet2.getOil(), "Pet 2 not oiled");
    }

    @Test
    public void testOilPets4() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        RoboDog testPet2 = new RoboDog("Dave", "orca");
        OrganicDog testPet3 = new OrganicDog("Dave", "orca");
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.oilRobots();
        assertEquals(100, testPet1.getOil(), "Pet 1 not oiled");
        assertEquals(100, testPet2.getOil(), "Pet 2 not oiled");
    }

    @Test
    public void testCleanCage1() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        RoboDog testPet2 = new RoboDog("Dave", "orca");
        OrganicDog testPet3 = new OrganicDog("Dave", "orca");

        testPet1.setCage(0);
        testPet2.setCage(0);
        testPet3.setCage(0);
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.cleanCages();
        assertEquals(100, testPet1.getCage(), "Pet 1 cage not cleaned");
        assertEquals(100, testPet2.getCage(), "Pet 2 cage not cleaned");
        assertEquals(100, testPet3.getCage(), "Pet 3 cage not cleaned");
    }

    @Test
    public void testCleanCage2() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        RoboDog testPet2 = new RoboDog("Dave", "orca");
        OrganicDog testPet3 = new OrganicDog("Dave", "orca");
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.cleanCages();
        assertEquals(100, testPet1.getCage(), "Pet 1 cage not cleaned");
        assertEquals(100, testPet2.getCage(), "Pet 2 cage not cleaned");
        assertEquals(100, testPet3.getCage(), "Pet 3 cage not cleaned");
    }

    @Test
    public void testCleanCage3() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        RoboDog testPet2 = new RoboDog("Dave", "orca");
        OrganicDog testPet3 = new OrganicDog("Dave", "orca");
        OrganicCat testPet4 = new OrganicCat("Dave", "orca");
        testPet1.setCage(0);
        testPet2.setCage(0);
        testPet3.setCage(0);
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.add(testPet4);
        testShelter.cleanCages();
        assertEquals(100, testPet1.getCage(), "Pet 1 cage not cleaned");
        assertEquals(100, testPet2.getCage(), "Pet 2 cage not cleaned");
        assertEquals(100, testPet3.getCage(), "Pet 3 cage not cleaned");
    }

    @Test
    public void testCleanLitterbox1() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        RoboDog testPet2 = new RoboDog("Dave", "orca");
        OrganicDog testPet3 = new OrganicDog("Dave", "orca");
        OrganicCat testPet4 = new OrganicCat("Dave", "orca");
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.add(testPet4);
        testShelter.setLitterbox(0);
        testShelter.cleanLitterbox();
        assertEquals(100, testShelter.getLitterbox(), "Litterbox not cleaned");
    }

    @Test
    public void testCleanLitterbox2() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        RoboDog testPet2 = new RoboDog("Dave", "orca");
        OrganicDog testPet3 = new OrganicDog("Dave", "orca");
        OrganicCat testPet4 = new OrganicCat("Dave", "orca");
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.add(testPet4);
        testShelter.cleanLitterbox();
        assertEquals(100, testShelter.getLitterbox(), "Litterbox not cleaned");
    }

    @Test
    public void testCleanLitterbox3() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        RoboDog testPet2 = new RoboDog("Dave", "orca");
        OrganicDog testPet3 = new OrganicDog("Dave", "orca");
        OrganicCat testPet4 = new OrganicCat("Dave", "orca");
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.add(testPet4);
        testShelter.setLitterbox(50);
        testShelter.cleanLitterbox();
        assertEquals(100, testShelter.getLitterbox(), "Litterbox not cleaned");
    }

    @Test
    public void testWalkPets1() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        RoboDog testPet2 = new RoboDog("Dave", "orca");
        OrganicCat testPet3 = new OrganicCat("Dave", "orca");
        testPet1.tick();
        testPet2.tick();
        testPet3.tick();
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.walkDogs();
        assertEquals(100, testPet1.getExercise(), "Pet 1 not exercised");
        assertEquals(100, testPet2.getExercise(), "Pet 2 not exercised");
        assertEquals(100, testPet1.getBladder(), "Pet 1 didn't empty bladder");
        assertEquals(100, testPet2.getBladder(), "Pet 2 didn't empty bladder");
        assertNotEquals(100, testPet3.getExercise(), "Pet 3 exercised");
    }

    @Test
    public void testWalkPets2() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        OrganicDog testPet2 = new OrganicDog("Dave", "orca");
        OrganicCat testPet3 = new OrganicCat("Dave", "orca");
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.oilRobots();
        assertEquals(100, testPet1.getExercise(), "Pet 1 not exercised");
        assertEquals(100, testPet2.getExercise(), "Pet 2 not exercised");
        assertEquals(100, testPet1.getBladder(), "Pet 1 didn't empty bladder");
        assertEquals(100, testPet2.getBladder(), "Pet 2 didn't empty bladder");
        assertEquals(100, testPet3.getExercise(), "Pet 3 not exercised");
    }

    @Test
    public void testWalkPets3() {
        virtualPetShelter testShelter = new virtualPetShelter("Dave", "orca");
        RoboDog testPet1 = new RoboDog("Dave", "orca");
        RoboDog testPet2 = new RoboDog("Dave", "orca");
        OrganicDog testPet3 = new OrganicDog("Dave", "orca");
        testPet1.tick();
        testPet2.tick();
        testShelter.add(testPet1);
        testShelter.add(testPet2);
        testShelter.add(testPet3);
        testShelter.walkDogs();
        assertEquals(100, testPet1.getExercise(), "Pet 1 not exercised");
        assertEquals(100, testPet2.getExercise(), "Pet 2 not exercised");
        assertEquals(100, testPet1.getBladder(), "Pet 1 didn't empty bladder");
        assertEquals(100, testPet2.getBladder(), "Pet 2 didn't empty bladder");
        assertEquals(100, testPet3.getExercise(), "Pet 3 not exercised");
        assertEquals(100, testPet3.getBladder(), "Pet 3 didn't empty bladder");
    }
}
