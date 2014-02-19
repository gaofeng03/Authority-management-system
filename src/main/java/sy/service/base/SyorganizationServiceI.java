package sy.service.base;

import java.util.List;

import sy.model.base.Syorganization;
import sy.service.BaseServiceI;
import sy.util.base.HqlFilter;

/**
 * 机构业务
 * 
 * @author lewis
 * 
 */
public interface SyorganizationServiceI extends BaseServiceI<Syorganization> {

	/**
	 * 更新机构
	 */
	public void updateOrganization(Syorganization syorganization);

	/**
	 * 机构授权
	 * 
	 * @param id
	 *            机构ID
	 * @param resourceIds
	 *            资源IDS
	 */
	public void grant(String id, String resourceIds);

	/**
	 * 查找机构
	 */
	public List<Syorganization> findOrganizationByFilter(HqlFilter hqlFilter);

	/**
	 * 保存机构
	 * 
	 * @param data
	 *            机构信息
	 * @param id
	 *            用户ID
	 */
	public void saveOrganization(Syorganization syorganization, String userId);

}
