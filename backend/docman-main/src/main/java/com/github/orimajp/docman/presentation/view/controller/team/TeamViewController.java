package com.github.orimajp.docman.presentation.view.controller.team;

import com.github.orimajp.docman.application.query.request.team.GetTeamInformationAppRequest;
import com.github.orimajp.docman.application.query.response.team.GetTeamInformationAppResponse;
import com.github.orimajp.docman.application.query.service.team.TeamQueryService;
import com.github.orimajp.docman.presentation.view.response.team.GetTeamInformationResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * チーム表示コントローラ
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/view/teams")
public class TeamViewController {

    private final TeamQueryService teamQueryService;

    private final TeamViewConvertor teamViewConvertor;

    // チーム情報表示
    // チーム別ドキュメント一覧

    // チームリスト取得
    @GetMapping
    public ResponseEntity<Object> getTeamList(@RequestParam("page") Integer page,
            @RequestParam("limit") Integer limit) {
        return ResponseEntity.noContent().build();
    }

    // チーム情報取得
    @GetMapping("{teamId}")
    public ResponseEntity<Object> getTeamData(@PathVariable("teamId") String teamId) {

        final GetTeamInformationAppRequest getTeamInformationAppRequest = new GetTeamInformationAppRequest();
        final GetTeamInformationAppResponse getTeamInformationAppResponse = teamQueryService.getTeamInformation(getTeamInformationAppRequest);
        final GetTeamInformationResponse getTeamInformationResponse = teamViewConvertor.createGetTeamInformationResponse(getTeamInformationAppResponse);

        return ResponseEntity.noContent().build();
    }

}
