public class School {
    private String name;
    private int studentsCount;
    private boolean isPublic;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStudentsCount() {
        return studentsCount;
    }
    public void setStudentsCount(int studentsCount) {
        this.studentsCount = studentsCount;
    }
    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean isPublic) {
        this.isPublic = isPublic;
    }
    @Override
    public String toString() {
        return "School" + "name=" + name + " studentsCount=" + studentsCount + " isPublic=" + isPublic ;
    }


}
