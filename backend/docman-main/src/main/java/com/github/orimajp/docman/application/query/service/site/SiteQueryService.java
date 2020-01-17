package com.github.orimajp.docman.application.query.service.site;

import com.github.orimajp.docman.application.query.request.site.GetSiteInformationAppRequest;
import com.github.orimajp.docman.application.query.response.site.GetSiteInformationAppResponse;

/**
 * サイトクエリサービスインタフェース
 */
public interface SiteQueryService {

    /**
     * サイト情報取得
     *
     * @param request サイト情報取得リクエスト
     * @return サイト情報
     */
    GetSiteInformationAppResponse getSiteInformation(GetSiteInformationAppRequest request);

}
