package am.jsl.personalfinances.dao.category;

import am.jsl.personalfinances.dao.DBUtils;
import am.jsl.personalfinances.dto.CategoryDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * {@link RowMapper} implementation that converts a row into a new CategoryDTO instance.
 *
 * @author hamlet
 */
public class CategoryDTOMapper implements RowMapper<CategoryDTO> {

	public CategoryDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CategoryDTO category = new CategoryDTO();
		category.setId(rs.getLong(DBUtils.id));
		category.setName(rs.getString(DBUtils.name));
		category.setIcon(rs.getString(DBUtils.icon));
		category.setColor(rs.getString(DBUtils.color));
		category.setParentId(rs.getLong(DBUtils.parent_id));
		return category;
	}
}
