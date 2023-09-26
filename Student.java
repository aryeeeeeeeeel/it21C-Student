class Student {
    String name;
    String section;
    String motto;
    
    Student(String name, String section, String motto) {
        this.name = name;
        this.section = section;
        this.motto = motto;
    }

    String getName() {
        return name;
    }
    String getSection() {
        return section;
    }
    String getMotto() {
        return motto;
    }
}