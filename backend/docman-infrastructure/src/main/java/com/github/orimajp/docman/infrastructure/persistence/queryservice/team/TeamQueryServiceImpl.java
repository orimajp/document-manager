package com.github.orimajp.docman.infrastructure.persistence.queryservice.team;

import com.github.orimajp.docman.application.query.request.team.GetTeamInformationAppRequest;
import com.github.orimajp.docman.application.query.response.team.GetTeamInformationAppResponse;
import com.github.orimajp.docman.application.query.service.team.TeamQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * チームクエリサービスクラス
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class TeamQueryServiceImpl implements TeamQueryService {

    /**
     * チーム情報取得
     *
     * @param request チーム情報取得リクエスト
     * @return チーム情報
     */
    @Override
    public GetTeamInformationAppResponse getTeamInformation(GetTeamInformationAppRequest request) {
        return null;
    }

}
