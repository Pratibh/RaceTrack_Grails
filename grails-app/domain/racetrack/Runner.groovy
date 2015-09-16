package racetrack

class Runner {
    String firstName
    String lastName
    Date dateOfBirth
    String gender
    String address
    String city
    String state
    String zipCode
    String email

    static constraints = {
        firstName (blank:false)
        lastName (blank: false)
        dateOfBirth()
        gender(inList: ["Male","Female"])
        address()
        city()
        state()
        zipCode()
        email()
    }

    static hasMany = [registrations: Registration]
    String toString(){
        return "${firstName},${lastName}"
    }
}
