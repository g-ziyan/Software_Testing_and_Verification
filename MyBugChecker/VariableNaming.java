/*
 * Copyright 2018 The Error Prone Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.errorprone.bugpatterns;

import static com.google.errorprone.BugPattern.SeverityLevel.ERROR;

import com.google.auto.service.AutoService;
import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker.VariableTreeMatcher;
import com.google.errorprone.matchers.Description;
import com.google.errorprone.util.ASTHelpers;
import com.sun.source.tree.VariableTree;
import com.sun.tools.javac.code.Symbol;
import javax.lang.model.element.Name;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@AutoService(BugChecker.class)
@BugPattern(
        name = "VariableNaming",
        summary =
                "Local variable names should not begin with Uppercase letter.",
        severity = ERROR)
public class VariableNaming extends BugChecker implements VariableTreeMatcher {

    @Override
    public Description matchVariable(VariableTree varTree, VisitorState state) {

        Name varName = varTree.getName();

        Pattern pattern = Pattern.compile("^[A-Z].*");

        Matcher matcher = pattern.matcher(varName);

        if (!matcher.matches()) {
            return Description.NO_MATCH;
        }
        String message =
                String.format(
                        "Variable named %s should not begin with Uppercase letter.",
                        varName);
        return buildDescription(varTree).setMessage(message).build();
    }
}
