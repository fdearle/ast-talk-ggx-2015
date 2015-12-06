package com.dearle.state.tape

class StateContext {
    def state = new EmptyState(this)
}
