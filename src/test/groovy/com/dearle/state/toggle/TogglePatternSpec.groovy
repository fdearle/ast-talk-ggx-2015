package com.dearle.state.toggle

import com.dearle.groovydsl.test.SpockScriptSpecification

class TogglePatternSpec extends SpockScriptSpecification {

    def "We can build a toggle State machine in Groovy using the State Pattern"() {
        given:
            def ledToggle = new LEDToggle()

        expect:
            ledToggle.state == 'OFF'

        when:
            ledToggle.toggle()

        then:
            ledToggle.state == 'ON'

        when:
            ledToggle.toggle()

        then:
            ledToggle.state == 'OFF'
    }

}
