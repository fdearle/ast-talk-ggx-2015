package com.dearle.state.toggle

state: "OFF"
state: "ON"

event: "toggle"
    when: "ON"
        next = "OFF"
    when: "OFF"
        next = "ON"