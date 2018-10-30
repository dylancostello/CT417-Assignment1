
import com.dylancostello.ct417assignment1.course;
import com.dylancostello.ct417assignment1.module;
import com.dylancostello.ct417assignment1.student;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.Assert;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dylan
 */
public class test {
    private student student1 = new student("Darragh Burns", 21,new DateTime(1997, 2, 10, 0, 0),"12345678");
    private student student2 = new student("Gareth Murphy", 22,new DateTime(1996, 4, 17, 0, 0),"12344321");
    
    @Test
    public void getUsername(){
        Assert.assertEquals(student1.getUsername(),"Darragh Burns21");
        Assert.assertEquals(student2.getUsername(),"Gareth Murphy22");
    }
}
