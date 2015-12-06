package com.dearle.state.tape

import com.dearle.groovydsl.test.SpockScriptSpecification

class TapePatternSpec extends SpockScriptSpecification {

    def "We can build a complex State machine in Groovy using the State Pattern"() {
        given:
            def tape = new TapeDeckDSL()
        expect:
            tape.state == 'EMPTY'

        when:
            tape.pause()
        then:
            tape.state == 'EMPTY'

        when:
            tape.start()
        then:
            tape.state == 'EMPTY'

        when:
            tape.stop()
        then:
            tape.state == 'EMPTY'

        when:
            tape.unload()
        then:
            tape.state == 'EMPTY'

        when:
            tape.load()
        then:
            tape.state == 'LOADED'

        when:
            tape.pause()
        then:
            tape.state == 'LOADED'

        when:
            tape.stop()
        then:
            tape.state == 'LOADED'

        when:
            tape.start()
        then:
            tape.state == 'RUNNING'

        when:
            tape.unload()
        then:
            tape.state == 'RUNNING'

        when:
            tape.load()
        then:
            tape.state == 'RUNNING'

        when:
            tape.stop()
        then:
            tape.state == 'LOADED'

        when:
            tape.start()
            tape.pause()
        then:
            tape.state == 'PAUSED'

        when:
            tape.load()
        then:
            tape.state == 'PAUSED'

        when:
            tape.unload()
        then:
            tape.state == 'PAUSED'

        when:
            tape.pause()
        then:
            tape.state == 'PAUSED'

        when:
            tape.start()
        then:
            tape.state == 'RUNNING'

        when:
            tape.pause()
            tape.stop()
        then:
            tape.state == 'LOADED'
    }

}
