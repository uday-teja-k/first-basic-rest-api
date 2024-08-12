package com.firstbasicapi.firstapi;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstapiController {

    @GetMapping(value = "/firstapi")   //we dont need to write value = 
    public String firstapihello(){
        return """ 
        Hello this is my first API----------------------------------------------  !!
        In the field of fluid mechanics, general vehicles are close to a bluff body. Their structure is
extremely complex in nature. Cavities present at inner and outer side of the body, rotating
wheels with different shapes and sizes constitute to more complexity into the design. Vehicles
possess complete 3 dimensional stream, flow separation is very common and follow by
reattachment. Huge turbulent wakes forms at the rear end of the body and in most of the cases
contain longitudinal trailing vertices. As a typical bluff body design “drag” which not the only
issue is the most common issue which is called pressure drag, which is different from drag
experienced by aircraft and ships which is called frictional drag. The avoidance of the
mentioned drag or if not practical its control in correct direction is the main goal of vehicle
aerodynamics. With regard to their usage road vehicles comprises of wide range of variety in terms of
shape and sizes for example passenger car including hatchbacks, sedans, SUV’s and other
type of vehicles such as busses, truck, getaway etc. It is interesting to know that truck and
even race cars have more than one body comparing with general vehicles having single body
As race car design being an exception the design of the road vehicles is not determined by the
need of aerodynamic effects. An airplane is designed keeping in mind to extract more and
more lift and ion the contrary passenger or general vehicles are designed for functional, economical as well as most importantly aesthetic concept. The approach in designing of these
two type of vehicles is totally different. Depending upon the need and purpose of each type of
vehicle the objectives of aerodynamics for each and every vehicle differ widely. While
designers look to pull out a design having least drag other aerodynamic property are also very
significant. Negative lift is boon for cornering aspects of race cars but it is not relevant for
trucks. Wind noise is the critical aspect in road vehicles and busses but significant with race
cars. For general vehicles exterior design is most important because as they say “what looks
good sells good” in the car market worldwide. Consequently, while vehicle aerodynamics is evolving and improving, it is not advancing
towards a single ultimate design, as in the case of subsonic transport aircraft, for example. On
the opposite, it has to come up again and again with new shapes. However, it cannot be
denied that aerodynamics does influence design. The high trunk typical of hatchback cars
with low drag is the most striking example. Although it tends to look "bulky," due to its
beneficial impact on drag— and the extra luggage space it offers, designers had to embrace it. Today's cars are more streamlined than ever, and its own styling element has become an
aero-look.
The study of automotive aerodynamics started as a step-by-step for similar research in the
field of aviation, using wind tunnels and technologies developed for aircraft from the 1920s. In the first place the pioneers of low-drag cars demonstrated models which were both
industry's ability to build and public's readiness to buy well ahead of the first time. The 1930s
introduced a novel approach to automotive aerodynamics, focusing basic automotive
engineering and achieving the first, serious production applications. Drastic changes to automobile design occurred in the 1950s, due to aerodynamic
concerns. After World War II in the 1950s, most of the aerodynamic research was aimed at
prototype designs and race cars as well as production vehicles were almost entirely influenced
by appearances. In the next decade, new wind tunnels were opened in a more promising way, for both climate and aerodynamic research. Car stability around the corners at high speed
became an important part. The manufacturers, who took this topic seriously, built their own internal tunnel facilities
at the end of the 1960's, which has seen a record number of automotive aerospace
applications. In the initial 50 years’ aerodynamics of automotive came closer to wind tunnels
with the help of universities and industries. These methods challenged researchers to find new
test programs and manufacturers make more aerodynamic product with high efficiency, quicker and even silent model. """;
    }

    @GetMapping(value = "/firstapione")
    public String apihellonew(){
        return "Hello this is my first API similar to the previous one  !!";
    }
}
