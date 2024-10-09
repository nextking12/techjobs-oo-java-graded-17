package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
    Job newJob = new Job();
    Job secondJob = new Job();
    assertNotEquals(newJob.getId(),secondJob.getId());
    };

    @Test
    public void testJobConstructorSetsAllFields(){
    Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals("Product tester", newJob.getName());
    assertEquals("ACME", newJob.getEmployer().getValue());
    assertEquals("Desert", newJob.getLocation().getValue());
    assertEquals("Quality control", newJob.getPositionType().getValue());
    assertEquals("Persistence", newJob.getCoreCompetency().getValue());

    }
    @Test
    public void testJobsForEquality(){
        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job secondJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


       if (newJob.equals(secondJob)){
           System.out.println("true");
       } else {
           System.out.println("false");
       }

        }


    }


