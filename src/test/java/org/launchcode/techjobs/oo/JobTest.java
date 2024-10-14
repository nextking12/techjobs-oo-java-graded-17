package org.launchcode.techjobs.oo;

import org.junit.Test;
import org.yaml.snakeyaml.DumperOptions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId() {
        Job newJob = new Job();
        Job secondJob = new Job();
        assertNotEquals(newJob.getId(), secondJob.getId());
    }

    ;

    @Test
    public void testJobConstructorSetsAllFields() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", newJob.getName());
        assertEquals("ACME", newJob.getEmployer().getValue());
        assertEquals("Desert", newJob.getLocation().getValue());
        assertEquals("Quality control", newJob.getPositionType().getValue());
        assertEquals("Persistence", newJob.getCoreCompetency().getValue());

    }

    @Test
    public void testJobsForEquality() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job secondJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


        if (newJob.equals(secondJob)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String newLine = System.lineSeparator();
        String firstCharacter = String.valueOf(newJob.toString().substring(0, 1));
        String lastCharacter = String.valueOf(newJob.toString().substring(newJob.toString().length() - 1));
        assertEquals(true, newJob.toString().startsWith(System.lineSeparator()));
        assertEquals(true, newJob.toString().endsWith(System.lineSeparator()));

    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobPrintOut = System.lineSeparator() +
                "ID: " + newJob.getId() + System.lineSeparator() +
                "Name: " + newJob.getName() + System.lineSeparator() +
                "Employer: " + newJob.getEmployer() + System.lineSeparator() +
                "Location: " + newJob.getLocation() + System.lineSeparator() +
                "Position Type: " + newJob.getPositionType() + System.lineSeparator() +
                "Core Competency: " + newJob.getCoreCompetency() +
                System.lineSeparator();

        assertEquals(jobPrintOut, newJob.toString());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job newJob = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        if (newJob.getEmployer().getValue().isEmpty()) {
            newJob.getEmployer().setValue("Data not available");
        }
        assertEquals(newJob.getEmployer().getValue(), "Data not available");

    }
}







