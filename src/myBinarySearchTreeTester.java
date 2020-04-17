import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class myBinarySearchTreeTester {
    //I have noticed that my tester class has been steadily been getter worse and worse
    //Hopefully this makes up if one or two tests are not very well worded
    @Test
    public void test1(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{4,1,7,2});
        t.print();
        assertEquals(4, t.size());
        assertEquals(3,t.height());
        assertEquals(2, t.depth(2));

    // Reason for the test is to see if the code properly handles a simple tree and moves left and right
    //Input: {4,1,7,2}
    //Expected output = size:4, height:3, depth: 2
    //Actual output = size:4, height:3, depth: 2
    }
    @Test
    public void test2(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{1,1,1});
        t.print();
        assertEquals(1, t.size());
        assertEquals(0,t.height());// failed, should be 0 and output is 1
        assertEquals(0, t.depth(1));
    }
    //Reason for this test is to see if the code can handle being given just the same number over and over
    //Input: {1,1,1}
    //Expected output = size:1, height:0, depth: 0
    //Actual output = size:1, height:1, depth: 0
    @Test
    public void test3(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{0,-12,12,7,-5});
        t.print();
        assertEquals(5, t.size());
        assertEquals(2,t.height()); // fails should be 2 but I am given a height of 3
        assertEquals(2, t.depth(-5));
    }
    //Reason for this test is to see if the code can handle with negative along with positive
    //Input: {0,-12,12,7,-5}
    //Expected output = size:5, height:3, depth: 2
    //Actual output = size:5, height:2, depth: 2
    @Test
    public void test4(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{5,1,3,7});
        t.insert(1);
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(new int[]{5,1,3,7});
        t.print();
        assertEquals(expected.myValue, t.myValue);
        assertEquals(expected.left.right.myValue, t.left.right.myValue);
        assertEquals(expected.right.myValue, t.right.myValue);
    }
    //Reason for the test is see if the code can properly work with comparing the trees
    // checked the left, and then right of the node it passed
    // checked the right node and it passed

    @Test
    public void test5(){
        myBinarySearchTreeNode t = new myBinarySearchTreeNode(new int[]{0,-1,1,-2,2,});
        t.insert(0);
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(new int[]{0,-1,1,-2,2});
        t.print();
        assertEquals(expected.myValue, t.myValue);
        assertEquals(expected.left.myValue, t.left.myValue);
        assertEquals(expected.right.myValue, t.right.myValue);
    }
    //Reason for the test is see if the code can properly work with comparing the trees with negatives
    //checked the left of the node it passed
    //checked the right node and it passed
}
