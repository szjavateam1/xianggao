package cc.mrbird.web.service;

import cc.mrbird.common.service.IService;
import cc.mrbird.web.domain.XgNeed;
import cc.mrbird.web.domain.XgProduction;
import cc.mrbird.web.dto.in.XgProductionPageIn;
import cc.mrbird.web.dto.out.IndexUserOut;
import com.github.pagehelper.PageInfo;

import java.util.Map;

/**
 * @Auther: Harden Yan
 * @Date: 2019/11/23 12:24
 * @Description:
 */
public interface XgProductionService  extends IService<XgProduction> {


    int  updateProductionById (XgProduction xgProduction);

    int checkedProductionById(XgProduction xgProduction);

    int addProduction(XgProduction xgProduction);

    PageInfo<XgProduction> getProductionListByItems(XgProductionPageIn productionPageIn);
    PageInfo<XgProduction> getProductionListByItemsWithAll(XgProductionPageIn productionPageIn);

    PageInfo<XgProduction> getPcWebPdList(XgProductionPageIn productionPageIn);

    XgProduction getProductionInfoById(XgProductionPageIn productionPageIn);

    Map<String , IndexUserOut> getDashBoardUpProNeedByItems(XgProductionPageIn productionPageIn);

    PageInfo<XgProduction> myCollectionProductions(XgProductionPageIn productionPageIn);

    //查询我关注的设计师的作品列表
    PageInfo <XgProduction> getMyStarProductionList(XgProductionPageIn productionPageIn);



}
