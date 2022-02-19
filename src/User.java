public class User {
    private String name;
    private int age;
    private String team;


    public User(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getName() + "\nIdade: " + this.getAge() + "\nTime do coração: " + this.getTeam();
    }
}
