package racetrack

class Registration {
    String name

    Boolean paid

    static constraints = {

        name()

        paid()

    }

    static belongsTo = [race:Race,runner:Runner]

    static mapping = {
        autoTimestamp false
    }
//
//    String toString(){
//        return "${name},${dateCreated.format('MM/DD/YY')}"
//    }
}
