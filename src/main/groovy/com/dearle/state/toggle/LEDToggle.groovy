package com.dearle.state.toggle

class LEDToggle {
    def context = new StateContext()

    def toggle() {
        context.state.toggle()
    }

    String getState() {
        context.state
    }
}