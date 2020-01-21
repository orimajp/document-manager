package com.github.orimajp.docman.presentation.view.controller.site;

import com.github.orimajp.docman.application.query.request.site.GetSiteInformationAppRequest;
import com.github.orimajp.docman.application.query.response.site.GetSiteInformationAppResponse;
import com.github.orimajp.docman.application.query.service.site.SiteQueryService;
import com.github.orimajp.docman.presentation.view.response.site.GetSiteInformationResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * サイト表示コントローラ
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/view/sites")
public class SiteViewController {

    private final SiteQueryService siteQueryService;

    private final SiteViewConvertor siteViewConvertor;

    // チーム一覧
    // 全ドキュメント一覧

    @GetMapping
    public ResponseEntity<Object> getSiteData() {

        final GetSiteInformationAppRequest getSiteInformationAppRequest = new GetSiteInformationAppRequest();
        final GetSiteInformationAppResponse getSiteInformationAppResponse = siteQueryService.getSiteInformation(getSiteInformationAppRequest);
        final GetSiteInformationResponse getSiteInformationResponse = siteViewConvertor.createGetSiteInformationResponse(getSiteInformationAppResponse);

        return ResponseEntity.ok(getSiteInformationResponse);
    }

}
