package com.dearle.state.toggle

class StateContext {
    def state = new OffState(this)
}
