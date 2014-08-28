package com.dz.common;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dz.configurable.ConfigurableBase;
  
/** 
* 
* <p>Title: æ•°æ�®åº“æ“�ä½œæŽ¥å�£</p> 
* <p>Description:EasyJWeb Toolsä¸­çš„æ·»åˆ æ”¹æŸ¥ç­‰ä¸šåŠ¡å¼•æ“Žä½¿ç”¨è¯¥DAOè¿›è¡Œæ•°æ�®åº“æ“�ä½œ </p> 
* <p>Copyright: Copyright (c) 2006</p> 
* @version 0.1 
*/  
public interface IDAO {  
    /** 
     * æŠŠå¯¹è±¡ä¿�å­˜åˆ°æŒ�ä¹…å±‚ 
     *  
     * @param obj 
     * @return è‹¥ä¿�å­˜æˆ�åŠŸï¼Œåˆ™è¿”å›žtrueï¼Œå�¦åˆ™è¿”å›žfalse 
     * @throws IdExistException 
     */  
	@Transactional(value = "transactionManager", propagation = Propagation.REQUIRED)
    public <T extends ConfigurableBase> T save( T base);
	
//    public boolean save(T obj);  

  
//    /** 
//     * æ›´æ–°æŒ�ä¹…å±‚ä¸­çš„å¯¹è±¡ 
//     *  
//     * @param obj 
//     * @return è‹¥ä¿®æ”¹æˆ�åŠŸï¼Œåˆ™è¿”å›žtrueï¼Œå�¦åˆ™è¿”å›žfalse 
//     */  
//    boolean update(T obj);  
//  
//    /** 
//     * åˆ é™¤æŒ�ä¹…å±‚ä¸­çš„å¯¹è±¡ 
//     *  
//     * @param obj 
//     * @return è‹¥åˆ é™¤æ“�ä½œæˆ�åŠŸï¼Œåˆ™è¿”å›žtrueï¼Œå�¦åˆ™è¿”å›žfalse 
//     */  
//    boolean del(T obj);  
//  
//    /** 
//     * æ ¹æ�®ç±»å�Šä¸»é”®åŠ è½½å¯¹è±¡ 
//     *  
//     * @param clz 
//     * @param id 
//     * @return è‹¥æŸ¥æ‰¾åˆ°æŒ‡å®šä¸»é”®å€¼çš„æŒ�ä¹…å¯¹è±¡ï¼Œåˆ™è¿”å›žè¯¥å¯¹è±¡ï¼Œå�¦åˆ™è¿”å›žnull 
//     */  
//    T get(Class<T> clz, Serializable id);  
//  
//    /** 
//     * æ ¹æ�®ç±»ã€�å­—æ®µå��å�Šå­—æ®µå€¼åŠ è½½å¯¹è±¡ï¼Œå�ªåŠ è½½ä¸€æ�¡ç¬¦å�ˆæ�¡ä»¶çš„å¯¹è±¡ã€‚ 
//     *  
//     * @param clz 
//     * @param fieldName 
//     * @param value 
//     * @return è‹¥æŸ¥è¯¢åˆ°æŒ‡å®šå±žæ€§å�Šå€¼çš„æŒ�ä¹…å¯¹è±¡ï¼Œåˆ™è¿”å›žè¯¥å¯¹è±¡ï¼Œå�¦åˆ™è¿”å›žnull 
//     */  
//    T getBy(Class<T> clz, String fieldName, Serializable value);  
//  
//    /** 
//     * æ ¹æ�®æ�¡ä»¶æŸ¥è¯¢å¯¹è±¡ 
//     *  
//     * @param clz ç±»å�� 
//     * @param scope æŸ¥è¯¢æ�¡ä»¶ 
//     * @return è¿”å›žæŸ¥è¯¢çš„è®°å½•ç»“æžœè®°å½• 
//     */  
//    List<T> query(Class<T> clz, String scope);  
//  
//    /** 
//     * æ ¹æ�®æ�¡ä»¶ã€�æ�¡ä»¶å�‚æ•°æŸ¥è¯¢å¯¹è±¡ 
//     *  
//     * @param clz ç±»å�� 
//     * @param scope æŸ¥è¯¢æ�¡ä»¶ 
//     * @param paras æŸ¥è¯¢å�‚æ•° 
//     * @return è¿”å›žæŸ¥è¯¢çš„è®°å½•ç»“æžœé›† 
//     */  
//    List<T> query(Class<T> clz, String scope, Collection paras);  
//  
//    /** 
//     * æŸ¥è¯¢ç¬¦å�ˆæ�¡ä»¶çš„å¯¹è±¡ï¼Œä»Žbeginå¼€å§‹å�–maxæ�¡è®°å½• 
//     *  
//     * @param clz Javaç±» 
//     * @param scope æŸ¥è¯¢æ�¡ä»¶ 
//     * @param paras æŸ¥è¯¢å�‚æ•° 
//     * @param begin è¿”å›žæœ‰æ•ˆç»“æžœå¼€å§‹è®°å½•æ•° 
//     * @param max  è¿”å›žçš„æœ€å¤šè®°å½•æ•° 
//     * @return è¿”å›žæŸ¥è¯¢çš„è®°å½•ç»“æžœé›† 
//     */  
//    List<T> query(Class<T> clz, String scope, Collection paras, int begin, int max);  
//      
//    /** 
//     * æ‰§è¡Œsqlè¯­å�¥ï¼Œå¹¶è¿”å›žä¸€ä¸ªå¯¹è±¡,å¦‚select count(*) from tableNameç­‰ 
//     * @param sql sqlè¯­å�¥ 
//     * @return è¿”å›žæŸ¥è¯¢ç»“æžœï¼Œè‹¥æ²¡æœ‰ç»“æžœåˆ™è¿”å›žnull 
//     */  
//    Object uniqueResult(String sql);  
//      
//    /** 
//     * æ ¹æ�®sqlè¯­å�¥å�ŠæŸ¥è¯¢å�‚æ•°æ‰§è¡ŒæŸ¥è¯¢ï¼Œå¹¶è¿”å›žä¸€ä¸ªå”¯ä¸€å¯¹è±¡ï¼Œå¦‚select count(*) from tableName where filed=? 
//     * @param sql 
//     * @param paras 
//     * @return è¿”å›žå�•ä¸€çš„æŸ¥è¯¢ç»“æžœï¼Œè‹¥æ²¡æœ‰ç»“æžœåˆ™è¿”å›žnull 
//     */  
//    Object uniqueResult(String sql,Collection paras);  
//      
//    /** 
//     * æ‰§è¡Œä»»æ„�sqlè¯­å�¥ï¼Œè¿”å›žå�—å½±å“�çš„è®°å½•æ•° 
//     * @param sql sqlè¯­å�¥ 
//     * @return è¿”å›žå�—å½±å“�çš„è®°å½•æ•° 
//     */  
//    int execute(String sql);   
//    /** 
//     * æ ¹æ�®sqlè¯­å�¥å�Šå�‚æ•°æ‰§è¡Œæ•°æ�®åº“æ“�ä½œï¼Œè¿”å›žå�—å½±å“�çš„è®°å½•æ•° 
//     * @param sql sqlè¯­å�¥ 
//     * @param paras å�‚æ•° 
//     * @return è¿”å›žå�—å½±å“�çš„è®°å½•æ•° 
//     */  
//    int execute(String sql,Collection paras);  
}  