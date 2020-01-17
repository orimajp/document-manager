package com.github.orimajp.docman.application.query.service.team;

import com.github.orimajp.docman.application.query.request.team.GetTeamInformationAppRequest;
import com.github.orimajp.docman.application.query.response.team.GetTeamInformationAppResponse;

/**
 * チームクエリサービスインタフェース
 */
public interface TeamQueryService {

    /**
     * チーム情報取得
     *
     * @param request チーム情報取得リクエスト
     * @return チーム情報
     */
    GetTeamInformationAppResponse getTeamInformation(GetTeamInformationAppRequest request);

}
