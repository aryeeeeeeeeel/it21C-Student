class Student_Main {
    
    public static void main(String[] args) {
    
        Student student = new Student("Ariel S. Sumantin", "IT21C", "Delete System32 but in real-life");
        
        System.out.println("Name: " + student.getName());
        System.out.println("Section: " + student.getSection());
        System.out.println("Motto: " + student.getMotto());
    }
}