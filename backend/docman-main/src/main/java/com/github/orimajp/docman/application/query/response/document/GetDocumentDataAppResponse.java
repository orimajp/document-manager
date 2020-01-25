package com.github.orimajp.docman.application.query.response.document;

import java.time.LocalDateTime;

/**
 * ドキュメントデータ取得アプリケーションレスポンスクラス
 */
public class GetDocumentDataAppResponse {

    /** ドキュメントキー */
    private String documentKey;

    /** ドキュメントタイトル */
    private String documentTitle;

    /** チームID */
    private String teamId;

    /** 説明 */
    private String description;

    /** 作成日時 */
    private LocalDateTime createDateTime;

    /** 作成者名 */
    private String createUserName;

    /** 更新日時 */
    private LocalDateTime updateDateTime;

    /** 更新者名 */
    private String updateUserName;

    /** リビジョン */
    private Integer revision;

    /** バージョン */
    private Integer version;

}
