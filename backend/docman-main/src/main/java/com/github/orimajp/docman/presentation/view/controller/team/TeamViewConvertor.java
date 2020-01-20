package com.github.orimajp.docman.presentation.view.controller.team;

import com.github.orimajp.docman.application.query.response.team.GetTeamInformationAppResponse;
import com.github.orimajp.docman.presentation.view.response.team.GetTeamInformationResponse;
import org.springframework.stereotype.Component;

@Component
public class TeamViewConvertor {

    GetTeamInformationResponse createGetTeamInformationResponse(GetTeamInformationAppResponse getTeamInformationAppResponse) {
        // TODO
        return new GetTeamInformationResponse();
    }

}
