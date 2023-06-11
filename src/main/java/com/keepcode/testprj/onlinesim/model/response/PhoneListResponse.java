package com.keepcode.testprj.onlinesim.model.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.jackson.Jacksonized;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class PhoneListResponse {

    private String response;
    private List<PhoneResponse> numbers = new ArrayList<>();

}
