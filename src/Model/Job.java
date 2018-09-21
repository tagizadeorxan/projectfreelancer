
package Model;

import java.sql.Date;

public class Job {
   
 
private Integer Budget; 
private String Details;

    @Override
    public String toString() {
        return "Job{" + "Budget=" + Budget + ", Details=" + Details + '}';
    }

    public Integer getBudget() {
        return Budget;
    }

    public void setBudget(Integer Budget) {
        this.Budget = Budget;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }

}