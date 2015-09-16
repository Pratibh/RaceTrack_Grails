import grails.util.GrailsUtil
import racetrack.Race
import racetrack.Registration
import racetrack.Runner

class BootStrap {

    def init = { servletContext ->

        /*  switch(GrailsUtil.environment){
            case "development":
                def pratibh = new Runner(
                        firstName:"Pratibh",
                        lastName:"Acharya",
                        dateOfBirth:(new Date() - 365*30),
                        gender:"Male",
                        address:"Dhapasi",
                        city:"Kathmandu",
                        state:"Bagmati",
                        zipcode:"12345",
                        email:"pratibh@gmail.com"
                )
                pratibh.save()
                if(pratibh.hasErrors()){
                    println pratibh.errors
                }

                def horseRace = new Race(
                        name:"Horse Race",
                        startDate:(new Date() + 90),
                        city:"Pokhara",
                        state:"Kaski",
                        distance:5.0,
                        cost:20.0,
                        maxRunners:350
                )
                horseRace.save()
                if(horseRace.hasErrors()){
                    println horseRace.errors
                }
                def reg = new Registration(
                        paid:false,
                        runner:pratibh,
                        race:horseRace
                )
                reg.save()
                if(reg.hasErrors()){
                    println reg.errors
                }
                break
            case "production" : break
        }
    }*/

        def destroy = {
        }
    }
}
