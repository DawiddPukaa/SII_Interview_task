package com.myConference.SIIProject.infrastructure.clock;

import java.time.Instant;

public interface ClockProvider {
    Instant instant();
}

