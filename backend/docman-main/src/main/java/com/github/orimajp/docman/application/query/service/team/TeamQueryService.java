package com.github.orimajp.docman.application.query.service.team;

import com.github.orimajp.docman.application.query.request.team.GetTeamInformationAppRequest;
import com.github.orimajp.docman.application.query.request.team.GetTeamListAppRequest;
import com.github.orimajp.docman.application.query.response.team.GetTeamInformationAppResponse;
import com.github.orimajp.docman.application.query.response.team.GetTeamListAppResponse;

/**
 * チームクエリサービスインタフェース
 */
public interface TeamQueryService {

    /**
     * チームリスト取得
     *
     * @param getTeamListAppRequest チームリスト取得アプリケーションリクエスト
     * @return チームリスト
     */
    GetTeamListAppResponse getTeamList(GetTeamListAppRequest getTeamListAppRequest);

    /**
     * チーム情報取得
     *
     * @param request チーム情報取得リクエスト
     * @return チーム情報
     */
    GetTeamInformationAppResponse getTeamInformation(GetTeamInformationAppRequest request);

}
