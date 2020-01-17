package com.github.orimajp.docman.infrastructure.persistence.queryservice.site;

import com.github.orimajp.docman.application.query.request.site.GetSiteInformationAppRequest;
import com.github.orimajp.docman.application.query.response.site.GetSiteInformationAppResponse;
import com.github.orimajp.docman.application.query.service.site.SiteQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * サイトクエリサービスクラス
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class SiteQueryServiceImpl implements SiteQueryService {

    /**
     * サイト情報取得
     *
     * @param request サイト情報取得リクエスト
     * @return サイト情報
     */
    @Override
    public GetSiteInformationAppResponse getSiteInformation(GetSiteInformationAppRequest request) {
        return null;
    }

}
