package com.github.orimajp.docman.application.query.request.team;

import lombok.Builder;
import lombok.Getter;

/**
 * チームリスト取得アプリケーションリクエストクラス
 */
@Getter
@Builder
public class GetTeamListAppRequest {

    private Integer page; // TODO デフォルト値

    private Integer limit; // TODO デフォルト値

}
