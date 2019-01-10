public class Hero extends People {

    private String name;
    void setName(String name1) throws  NoNameException{
        if(name1 == "" || name1 == null){
            this.name = "Кто-то";
            throw new NoNameException();
        }
        else {
            this.name = name1;
        }
    }

    @Override
    void go(String place) {
        System.out.println(name + " пошел " + place);;
    }

    void notThink(){
        System.out.println(name + "не знал что предпринять");
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return name.length();
    }

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj)) return  false;
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;
        People pep = (People) obj;
        return this.name == pep.toString();
    }
}
