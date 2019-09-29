package org.acme;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
@Getter
public class Greeting {

    private final String id;
    private final String content;
}
