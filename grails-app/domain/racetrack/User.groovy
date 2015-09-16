package racetrack

class User {

    String login
    String password
    String role ="User"

    static constraints = {
        login(blank:false,nullable:false,unique:true)
        password(blank: false,password:true)
        role(inList: ["Admin","User"])

    }
    String toString(){
        login
    }
}
