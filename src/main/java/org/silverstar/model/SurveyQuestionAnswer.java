package org.silverstar.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import static lombok.AccessLevel.PRIVATE;

@Getter
@Builder
@AllArgsConstructor(access = PRIVATE)
public class SurveyQuestionAnswer {

    SurveyQuestionAnswerId id;

    private String description;

}
