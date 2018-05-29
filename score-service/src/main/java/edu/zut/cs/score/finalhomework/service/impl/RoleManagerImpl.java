package edu.zut.cs.score.finalhomework.service.impl;

import org.springframework.stereotype.Component;

import edu.zut.cs.score.base.service.impl.GenericManagerImpl;
import edu.zut.cs.score.finalhomework.domain.Role;
import edu.zut.cs.score.finalhomework.service.RoleManager;
@Component
public class RoleManagerImpl extends GenericManagerImpl<Role, Long> implements RoleManager{

}
