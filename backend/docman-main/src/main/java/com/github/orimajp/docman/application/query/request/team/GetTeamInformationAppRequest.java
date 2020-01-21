package com.github.orimajp.docman.application.query.request.team;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * チーム情報アプリケーションリクエストクラス
 */
@Getter
@RequiredArgsConstructor(staticName = "of")
public class GetTeamInformationAppRequest {

    private final String teamId;

}
