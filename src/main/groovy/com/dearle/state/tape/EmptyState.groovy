package com.dearle.state.tape

class EmptyState {
    def context
    EmptyState(context) {
        this.context = context
    }

    def load() {
        if (context.state.toString() == 'EMPTY')
            context.state = new LoadedState(context)
    }

    def start() {
    }

    def pause() {
    }

    def stop() {
    }

    def unload() {
    }

    String toString() {
        "EMPTY"
    }

}
