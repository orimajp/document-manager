package com.github.orimajp.docman.presentation.view.controller.team;

import com.github.orimajp.docman.application.query.response.team.GetTeamInformationAppResponse;
import com.github.orimajp.docman.application.query.response.team.GetTeamListAppResponse;
import com.github.orimajp.docman.presentation.view.response.team.GetTeamInformationResponse;
import com.github.orimajp.docman.presentation.view.response.team.GetTeamListResponse;
import org.springframework.stereotype.Component;

@Component
public class TeamViewConvertor {

    GetTeamListResponse createGetTeamListResponse(GetTeamListAppResponse getTeamListAppResponse) {
        // TODO
        return new GetTeamListResponse();
    }

    GetTeamInformationResponse createGetTeamInformationResponse(GetTeamInformationAppResponse getTeamInformationAppResponse) {
        // TODO
        return new GetTeamInformationResponse();
    }

}
