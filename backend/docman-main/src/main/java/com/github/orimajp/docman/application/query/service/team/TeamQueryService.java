package com.github.orimajp.docman.application.query.service.team;

import com.github.orimajp.docman.application.query.request.team.GetTeamInfoAppRequest;
import com.github.orimajp.docman.application.query.response.team.GetTeamInfoAppResponse;

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
    GetTeamInfoAppResponse getTeamInfo(GetTeamInfoAppRequest request);

}
